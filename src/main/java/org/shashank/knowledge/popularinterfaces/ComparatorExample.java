package org.shashank.knowledge.popularinterfaces;
/*
A comparable object is capable of comparing "itself" with another object.
The class "itself" must implements the java.lang.Comparable interface.

Consider a Movie class that has members like, rating, name, year.
Suppose we wish to sort a list of Movies based on year of release.
We can implement the Comparable interface with the Movie class,
and we override the method compareTo() of Comparable interface.

Now, suppose we want to sort movies by their rating and names as well.
When we make a collection element comparable(by having it implement Comparable),
we get only one chance to implement the compareTo() method.
The solution is using Comparator.

@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
    boolean equals(Object obj);
}
 */
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

@AllArgsConstructor
@Setter @Getter
class Movie implements Comparable<Movie>
{
    private String name;
    private double rating;
    private int year;
    // Used to sort movies by year
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }
}

// Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}

// Class to compare Movies by name
class NameCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}

class ComparatorExample
{
    public static void main(String[] args)
    {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));

        // Use comparator to sort
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        list.forEach(m -> System.out.println(m.getName()));

        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        list.forEach(m -> System.out.println(m.getName()));

        // Uses Comparable to sort by year
        Collections.sort(list);
        list.forEach(m -> System.out.println(m.getName()));
    }
}

