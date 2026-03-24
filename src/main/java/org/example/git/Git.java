package org.example.git;

public class Git {



    public static String[] simulateMerge(String base, String hash){
        return new String[]{"git", "merge-tree" , hash, base};
    }

    public static String[] verifyCommit(String hash) {
        return new String[]{"git", "rev-parse", "--verify", hash};
    }

}
