public class Gene {

    String dna;   
    int geneCount;

    Gene(String dna) {
        this.dna = dna;
        this.geneCount = dna.length() % 3;
    }

    static int countNucleotides(String g, char nucleotide) {
        int count = 0;
        for (int i = 0; i < g.length(); i++) {
            if (g.charAt(i) == nucleotide) {
                count++;
            }
        }
        return count;
    }

    
    static String findGenes(String dna, int startIndex) {
        return dna.substring(startIndex);
    }

    static int findStopCodon( String genome, int start) {

        if (0 != genome.length() % 3) {
            return -1;
        }
    
        for (int i = start; i < genome.length(); i += 3) {
            String codon = genome.substring(i, i+3);
            if (codon.equals("TAG")) {
                return i;
            }
            if (codon.equals("TAA")) {
                return i;
            }
            if (codon.equals("TGA")) {
                return i;
            }
        }
        return -1;
    }
    

    static boolean potentialGene(String dna) {
        if (dna.substring(0,3) == "ATG") { 
            return false; 
        }
        if (dna.length() % 3 == 0) {
            String end = dna.substring(dna.length()-3);
            if (end.equals("TAG")) {
                if (end.equals("TAA")) {
                    if (end.equals("TGA")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String dna = "ATGCGATACGCTTGA";

        System.out.println(dna);
        System.out.println("# of T nucleotides ");
        System.out.println(countNucleotides(dna, 'T'));
        System.out.println("genes starting at index 6 ");
        System.out.println(findGenes(dna, 6));
        System.out.println("is it a gene? ");
        System.out.println(potentialGene(dna));
        System.out.println("first stop codon ");
        System.out.println(findStopCodon(dna, 0));
    }

}
