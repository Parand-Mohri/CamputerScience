import java.io.*;
import java.util.*;
import java.util.Arrays.*;

//Class that helps us to return two elements in one method. One boolean and one array
class returnClass
{
  public boolean bool;
  public int[] Nodes_colours;
  public returnClass(boolean bool, int[] Nodes_Colours)
  {
    this.bool = bool;
    this.Nodes_colours = Nodes_colours;
  }
}

//Classes used to help store information encountered in processFile()
class ColEdge
{
	int u;
	int v;
}

class GraphInfo
{
	int n; //n: number of vertices in graph
	int m; //m: number of edges in graph
	ColEdge[] e; //e contains the edges of the graph
	int[] nodeDegrees; //nodeDegrees contains the degree of each node
}

//Class that helps us return three elements for deleting edges with no collision
class RemoveEdgesClass{
  public int [][] Edges_new;
  public int [][] Edges_Colours_new;
  public int flag;
  public RemoveEdgesClass(int flag, int [][] Edges_new, int [][] Edges_Colours_new)
  {
    this.flag = flag;
    this.Edges_new = Edges_new;
    this.Edges_Colours_new = Edges_Colours_new;
  }
}

//Class that helps us return two elements. One array with sorted nodes and one with sorted nodes and their degree
class returnSorting
{
  public int[] Sorted_Nodes;
  public int[] Sorted_nodeDegrees;
  public returnSorting(int[] SN, int[] SND)
  {
    this.Sorted_Nodes = SN;
    this.Sorted_nodeDegrees = SND;
  }
}

public class Group06Project
{
  final static boolean DEBUG = false;
  final static boolean BINARYSEARCH = true;

  final static long START = System.currentTimeMillis();
  final static long TIMELIMIT = 60000;

  public static void main(String[] args)
  {
    GraphInfo info = processFile(args[0]);

    int upperBound = UpperBound(info)+1;
    int lowerBound = LowerBound(info);
    int[] Nodes = new int[info.n];
    int[] Nodes_Colours = new int[info.n];
    int[] nodeDegrees = info.nodeDegrees;

    for (int i = 0; i < info.n; i++ )
    {
      Nodes[i] = i + 1;
      Nodes_Colours[i] = 0;
    }
    if(DEBUG)
    {
      System.out.println("Nodes: " + Arrays.toString(Nodes));
      System.out.println("nodeDegrees: " + Arrays.toString(nodeDegrees));
    }

    int[][] SortedNodesAndDegrees = sortByNodeDegrees(nodeDegrees);
    int[] Nodes_Sorted = new int[Nodes.length];
    for (int i = 0; i < Nodes.length; i++)
    {
      Nodes_Sorted[i] = SortedNodesAndDegrees[i][0];
    }

    if(DEBUG) System.out.println("Sorted nodes: " + Arrays.toString(Nodes_Sorted));

    int[][] Edges = new int[info.e.length][2];
    int[][] Edges_Colours = new int[info.e.length][2];
    for (int i = 0; i< info.e.length; i++)
    {
      Edges[i][0] = info.e[i].u;
      Edges[i][1] = info.e[i].v;
      Edges_Colours[i][0] = 0;
      Edges_Colours[i][1] = 0;
    }

    int coloursNeeded = -1;
    boolean inTime = true;
    int newUpperBound = upperBound;
    int newLowerBound = lowerBound;

    //Binary search for chromatic number
    System.out.println("This program will search for the chromatic number for " + TIMELIMIT/1000 + " seconds");
    if(BINARYSEARCH){
      System.out.println("LOADING...");
      int left = lowerBound;
      int right = upperBound;
      int middle;
      while (left <= right)    //I is amount of colours used.
      {
        if( left == right)
        {
          coloursNeeded = left;
          break;
        }
        middle = (right+left)/2;
        if(DEBUG) System.out.println("middle = " + middle);
        System.out.println("Testing " + middle + " colors");
        returnClass result = graphColouring(Nodes_Sorted, Nodes_Colours, Edges, Edges_Colours, 0, middle);
        //If the result could not be found in time
        if(result == null)
        {
          inTime = false;
          break;
        }

        boolean satisfiable = result.bool;
        System.out.println(satisfiable);
        if((left == right-1) && (!satisfiable))
        {
          coloursNeeded = right;
          break;
        } else if ((left == right-1) && (satisfiable)){
          coloursNeeded = left;
          break;
        }

        if (satisfiable){
          newUpperBound = middle;
          right = middle;
        } else {
          newLowerBound = middle;
          left = middle + 1;
        }
      }
    } 
    else
    {
      //regular search for chromatic number
      for (int i = lowerBound; i <= upperBound; i++)    //I is amount of colours used.
      {
        System.out.println(i);
        returnClass result = graphColouring(Nodes_Sorted, Nodes_Colours, Edges, Edges_Colours, 0, i);

        if(result == null) 
        {
          inTime = false;
          newLowerBound = i-1;
          newUpperBound = -1;
          break;
        }

        boolean satisfiable = result.bool;
        if (satisfiable){
          coloursNeeded = i;
          break;
        }
      }
    }

    //If we want to start the from the upperBound to the lowerBound
    /*for (int i = upperBound; i >= lowerBound; i--)    //I is amount of colours used.
    {
      System.out.println(i);
      boolean satisfiable = graphColouring(Nodes, Nodes_Colours, Edges, Edges_Colours, 0, i).bool;
      if(result == null) 
        {
          inTime = false;
          newLowerBound = -1;
          newUpperBound = i+1;
          break;
        }
      if (!satisfiable){
        coloursNeeded = i + 1;
        break;
      }
    }*/

    //Print out Chromatic number
    if(inTime)
      System.out.println("The chromatic number for this graph is: " + coloursNeeded);
    else
    {
      System.out.println("The graph was too complex! The upper bound is: " + UpperBound(info));
      if(newLowerBound == 2) newLowerBound = 1;
      System.out.println("  The largest number of colors that we found where the graph can't be colored is: " + newLowerBound);
      System.out.println("  and the smallest number of colors that we found where we can color the graph is: " + newUpperBound);
    }

}
  //creates array with nodes and their vertex degree, sorted from heighest degree to lowest
  public static int[][] sortByNodeDegrees(int[] nodeDegrees) {
        int[][] sortedNodeDegrees = new int[nodeDegrees.length][2];
        for (int i = 0; i < nodeDegrees.length; i++) {
            sortedNodeDegrees[i][0] = i + 1;
            sortedNodeDegrees[i][1] = nodeDegrees[i];
        }

        Arrays.sort(sortedNodeDegrees, new Comparator<int[]>() {
            @Override
            public int compare(int[] x1, int[] x2) {
                return Integer.compare(x2[1], x1[1]);
            }
        });
        return sortedNodeDegrees;
}


public static int LowerBound(GraphInfo info) {
    double result=0;
    for (int i=0; i<info.n; i++) {
      double a = (double)1/(info.n-info.nodeDegrees[i]);
      result=result+a;
      //System.out.println((info.n-info.nodeDegrees[i]));
    }
    int lowerBound = (int) Math.ceil(result);
    return lowerBound;
  }


//Method calculates the upperbound
// public static int UpperBound(GraphInfo info)
// 	{
// 		int maxDegree = 0;
// 		for(int i = 0; i < info.n; i++)
// 		{
// 			if(maxDegree < info.nodeDegrees[i]) maxDegree = info.nodeDegrees[i];
// 		}
// 		return maxDegree;
// 	}
public static int UpperBound(GraphInfo info)
{
  int [] x = new int[info.nodeDegrees.length+1]; 
  for(int i = 0; i<info.nodeDegrees.length; i++)
  {
    x[i+1] = info.nodeDegrees[i];
  }
  for (int i = 1; i < x.length; i++)
  {
    for (int j = 1; j< x.length -1 -(i-1); j++ )
    {
      if (x[j]<x[j+1])
      {
        int y = x[j];
        x[j] = x[j+1];
        x[j+1] = y;
      }
    }
  }
  int upperbound = 0; 
  for (int i = 1; i > x.length; i++)
  {
    if (upperbound < Math.min(x[i]+1, i))
    {
      upperbound = Math.min(x[i]+1, i);
    }
  }
  return upperbound;
}

  //This method checks if a graph is "colorable" using a certain amount of numbers, starting from a given node
  //next_node is the index of of the next node to be coloured
  public static returnClass graphColouring(int[] Nodes, int[] Nodes_Colours,int[][] Edges, int[][] Edges_Colours, int next_node, int Colours)
  {

    // Base case : the array that contains the edges is empty
     if (Edges.length == 0)
     {
       if(DEBUG) System.out.println("return: empty Edges");
       return new returnClass(true, Nodes_Colours);
     }

     //This is the time constraint to determine if a graph is too complex (currently set to 20 seconds)
     if(System.currentTimeMillis() - START >= TIMELIMIT)
     {
       return null;
     }

     //Fill in colours for nodes that have already been given a colour
    Edges_Colours = colourNode(Edges, Edges_Colours, Nodes[next_node], Nodes_Colours[next_node]); // This method needs to fillIn all the correct colours

     // Delete values from previous branches
     for (int i = 0; i < Nodes.length; i++)
     {
       if (Nodes_Colours[i] == 0) //Node i has index i in the Nodes array
       {
         Edges_Colours = colourNode(Edges, Edges_Colours, Nodes[i], 0);   //method to finn in coloured
       }
     }

    //Checks for collisions in the Edges_Colours array, removes the edges where there is no collision, and returns if the array is empty!
    RemoveEdgesClass newEdgesInfo = removeEdges(Edges, Edges_Colours);

    //Checks if the array was empty
    if(newEdgesInfo.flag == 1) //The array is empty
    {
      return new returnClass(true, Nodes_Colours);
    }
    else if(newEdgesInfo.flag == 2) //There was a collision
    {
      return new returnClass(false, Nodes_Colours);
    }

    int [][] Edges_new = newEdgesInfo.Edges_new;
    int [][] Edges_Colours_new = newEdgesInfo.Edges_Colours_new;

    if(DEBUG) System.out.println("Nodes: " + Arrays.toString(Nodes) + " = " + Arrays.toString(Nodes_Colours));
    if(DEBUG) System.out.println("Edges: " + Arrays.deepToString(Edges));
    if(DEBUG) System.out.println("Edges_Colours: " + Arrays.deepToString(Edges_Colours));

    //select next node to receive a colour
    int nextNodeToColour = -1;
    for(int i = 0; i < Nodes_Colours.length; i++)
    {
      if (Nodes_Colours[i] == 0)
      {
        nextNodeToColour = i;
        break;
      }
    }
    if (DEBUG){System.out.println("next_node will be: " + Nodes[nextNodeToColour] + " With position: " + nextNodeToColour );}

    int j = 1;
    int[] Nodes_Colours_new;

    //Only checking the colors up to how many nodes we're checking
    while (j <= Colours && j <= nextNodeToColour + 1)
    {
      if(DEBUG) System.out.println("The color willbe: " + j);

      //We need to make copies of the arrays before passing them through so we don't change our original array.
      Nodes_Colours_new = Nodes_Colours.clone();
      Nodes_Colours_new[nextNodeToColour] = j;
      if(DEBUG) System.out.println("New colors: " + Arrays.toString(Nodes_Colours_new));
      returnClass result = graphColouring(Nodes, Nodes_Colours_new, Edges_new, Edges_Colours_new, nextNodeToColour, Colours);
      if (result == null)
      {
        return null;
      }
      if (result.bool)
      {
        return new returnClass(true, Nodes_Colours);
      }
      j++;
    }

    return new returnClass(false, Nodes_Colours);
  }

  //This method will check for adjacent node collisions, and remove edges where there are none
  public static RemoveEdgesClass removeEdges(int[][] Edges, int[][] Edges_Colours){
      
    //Edges where both nodes are coloured can be removed
   int[] toRemove = new int[Edges.length];
   for (int i = 0; i<Edges.length; i++ )
   {
     toRemove[i] = -1;
   }
   int numIndicesToRemove = 0;


   for (int i = 0; i<Edges.length; i++)
   {
     // If one of two nodes sharing an edge haven't been coloured yet, we skip it
     if (Edges_Colours[i][0] == 0 || Edges_Colours[i][1] == 0)
     {
       continue;
     }
     //If two nodes sharing an edge have the same colour, return false
     if (Edges_Colours[i][0] == Edges_Colours[i][1])
     {
       return new RemoveEdgesClass(2,Edges,Edges_Colours); 
     }
     //If two nodes sharing an edge have been given a different colour we can remove them from the list
     if (Edges_Colours[i][0] != Edges_Colours[i][1])
     {
       toRemove[numIndicesToRemove++] = i;
       if(DEBUG){System.out.println("index to be removed: " + i);}
     }
    }

    // make new list with edges that are coloured removed
    int[][] Edges_new = new int[Edges.length-numIndicesToRemove][2];
    int[][] Edges_Colours_new = new int[Edges.length-numIndicesToRemove][2];



    int pos = 0;
    for (int i = 0; i<Edges.length; i++)
    {
      if(!integerInList(toRemove, i))          //implement contains method
      {
        Edges_new[pos] = Edges[i];
        Edges_Colours_new[pos] = Edges_Colours[i];
        pos++;
      }
    }

    //If there are no edges left this means all nodes have been coloured
    if(Edges_new.length == 0)
    {
      return new RemoveEdgesClass(1, Edges,Edges_Colours);
    } 

    return new RemoveEdgesClass(0,Edges_new,Edges_Colours_new);
}

  //This method will check if an integer appears in a list
  public static boolean integerInList (int[] array, int integer) 
  {
		boolean found = false;

    for (int x : array)
    {
      if (x == integer)
      {
				found = true;
				break;
			}
		}

		return found;
	}

  //This method will fill in the edgesColours array based on the node we want to color a certain color
  public static int[][] colourNode(int[][] edges, int[][] edgesColours, int node, int colour)
	{
		for(int i = 0; i < edges.length; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				if(edges[i][j] == node) edgesColours[i][j] = colour;
			}
		}
		return edgesColours;
	}


	public final static String COMMENT = "//";

  //This method will read in a file and return the relevant information of the graph
	public static GraphInfo processFile(String filePath)
	{
		boolean seen[] = null;

		//! n is the number of vertices in the graph
		int n = -1;

		//! m is the number of edges in the graph
		int m = -1;

		//! e will contain the edges of the graph
		ColEdge e[] = null;

		//! N will contain the degrees of the nodes in the graph
		int N[] = null;

		try
		{
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);

			String record = new String();

			//! THe first few lines of the file are allowed to be comments, staring with a // symbol.
			//! These comments are only allowed at the top of the file.

			//! -----------------------------------------
			while ((record = br.readLine()) != null)
			{
				if( record.startsWith("//") ) continue;
				break; // Saw a line that did not start with a comment -- time to start reading the data in!
			}

			if( record.startsWith("VERTICES = ") )
			{
				n = Integer.parseInt( record.substring(11) );
				if(DEBUG) System.out.println(COMMENT + " Number of vertices = "+n);
			}

			seen = new boolean[n+1];
			record = br.readLine();

			if( record.startsWith("EDGES = ") )
			{
				m = Integer.parseInt( record.substring(8) );
				if(DEBUG) System.out.println(COMMENT + " Expected number of edges = "+m);
			}

			e = new ColEdge[m];
			N = new int[n];

			for( int d=0; d<m; d++)
			{
				if(DEBUG) System.out.println(COMMENT + " Reading edge "+(d+1));
				record = br.readLine();
				String data[] = record.split(" ");
				if( data.length != 2 )
				{
					System.out.println("Error! Malformed edge line: "+record);
					System.exit(0);
				}
				e[d] = new ColEdge();

				e[d].u = Integer.parseInt(data[0]);
				e[d].v = Integer.parseInt(data[1]);

				seen[ e[d].u ] = true;
				seen[ e[d].v ] = true;

				//If a node appears in an edge, raise it's degree
				N[e[d].u-1]++;
				N[e[d].v-1]++;

				if(DEBUG) System.out.println(COMMENT + " Edge: "+ e[d].u +" "+e[d].v);
			}

			String surplus = br.readLine();
			if( surplus != null )
			{
				if( surplus.length() >= 2 ) if(DEBUG) System.out.println(COMMENT + " Warning: there appeared to be data in your file after the last edge: '"+surplus+"'");
			}

		}
		catch (IOException ex)
		{
			// catch possible io errors from readLine()
			System.out.println("Error! Problem reading file "+filePath);
			System.exit(0);
		}

		for( int x=1; x<=n; x++ )
		{
			if( seen[x] == false )
			{
				if(DEBUG) System.out.println(COMMENT + " Warning: vertex "+x+" didn't appear in any edge : it will be considered a disconnected vertex on its own.");
			}
		}

		GraphInfo result = new GraphInfo();
		result.n = n;
		result.m = m;
		result.e = e;
		result.nodeDegrees = N;

		return result;
	}
}




