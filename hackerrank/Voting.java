import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
101 October 2015
Url: https://www.hackerrank.com/contests/101hack30/challenges/voting-1
*/
public class Voting {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int T=in.nextInt();
      HashMap<String,Integer> votes=new HashMap<String,Integer>();
      for(int i=0;i<T;i++){
      	String vote=in.next();
      	if(votes.containsKey(vote)){
      		int currentCount=votes.get(vote)+1;
      		votes.put(vote,currentCount);
      	}else{
      		votes.put(vote,1);
      	}
      }

      Set<String> candidates=votes.keySet();
      int maxVotes=0;
      String winner=null;
      for(String candidate:candidates){
      	if(votes.get(candidate)>maxVotes){
      		maxVotes=votes.get(candidate);
      		winner=candidate;
      	}
      }
      System.out.println(winner);
    }
}