package org.shashank.knowledge.problems.misc;

import java.util.*;

public class ElectionWinner {


    public static List<String> winners(String[] votes){

        List<String> output = new ArrayList<>();
        Map<String, Integer> votesCount = new HashMap<>();
        for(String vote: votes){
            votesCount.put(vote, votesCount.getOrDefault(vote, 0)+1);
        }

        Collection<Integer> voteCountValues = votesCount.values();
        int maxVote = voteCountValues.stream().max(Integer::compareTo).get();
        for(Map.Entry<String, Integer> entry: votesCount.entrySet()){
            if(entry.getValue() == maxVote) output.add(entry.getKey());
        }

        return output;

    }

    public static void main(String[] args) {
        String[] votes = {"john", "johnny", "jackie", "jamie", "jamie", "jackie", "jamie", "jamie", "john",
                "johnny", "jamie", "johnny", "john"};

        winners(votes).forEach(System.out::println);
    }
}
