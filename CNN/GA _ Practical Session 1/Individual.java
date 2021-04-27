
public class Individual {
	
	char[] chromosome;
	double fitness;
	int id;
	static int numOfIds = 0;
	
	public Individual(char[] chromosome) {
		this.chromosome = chromosome;
		this.fitness = 0;
		numOfIds++;
		id = numOfIds;
	}


	public char[] getChromosome() {
		return chromosome;
	}

	public void setChromosome(char[] chromosome) {
		this.chromosome = chromosome;
	}

	public double getFitness() {
		return fitness;
	}

	public void setFitness(double fitness) {
		this.fitness = fitness;
	}
	
	public String genoToPhenotype() {
		StringBuilder builder = new StringBuilder();
		builder.append(chromosome);
		return builder.toString();
	}
	
	public Individual clone() {
		char[] chromClone = new char[chromosome.length];
		for(int i = 0; i < chromClone.length; i++) {
			chromClone[i] = chromosome[i];
		}
		return new Individual(chromClone);
	}
	


}
