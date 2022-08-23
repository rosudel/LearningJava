package Streams;

import java.util.List;

public class StreamsDemo {
    public static void main(String[] args){
        List<Movie> movies = List.of(
          new Movie("a", 10),
          new Movie("b", 15),
          new Movie("c", 20)
        );

        //Imperative Programming

        int count = 0;
        for(var x : movies)
            if(x.getLikes() > 10)
                count++;
        System.out.println(count);



        //Declarative or functional Programming (Stream)

        var count2 = movies.stream()
                .filter(x -> x.getLikes() > 10)
                .count();
        System.out.println(count2);
    }
}
