package collections;

import java.util.*;

public class CollectionLists {
    List<Movie> MovieArrayList = new ArrayList<>();
    List<Movie> MovieLinkedList = new LinkedList<>();

    Set<Movie> MovieHashSet = new HashSet<>();
    Set<Movie> MovieTreeSet = new TreeSet<>(new Tree_SetComparator());

    Map<Integer, Movie> MovieHashMap = new HashMap();
    Map<Integer, Movie> MovieTreeMap = new TreeMap<>();

   static class Tree_SetComparator implements Comparator<Movie>
    {
        @Override
        public int compare(Movie p1, Movie p2)
        {
            return 0;
        }
    }
}
