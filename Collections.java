package collections;

import java.util.*;

public class Collections {

    private final String Start = "1. Wyświetl\n2. Usuń\n3. Wyjście z programu";
    private final String collectionChoice = "1. ArrayList\n2. LinkedList\n3. HashSet\n4. TreeSet\n5. HashMap\n6. TreeMap\n";
    final List<Movie> MovieArrayList = new ArrayList<>();
    final List<Movie> MovieLinkedList = new LinkedList<>();

    final Set<Movie> MovieHashSet = new HashSet<>();
    final Set<Movie> MovieTreeSet = new TreeSet<>(new CollectionLists.Tree_SetComparator());

    final Map<Integer, Movie> MovieHashMap = new HashMap();
    final Map<Integer, Movie> MovieTreeMap = new TreeMap<>();

    void RunProgram() {
        Movies();
        int choice;

        Scanner s = new Scanner(System.in);

        do
        {
            System.out.println(Start);
            choice = s.nextInt();

            switch (choice)
            {
                case 1:
                    show();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    break;
            }
        } while (choice != 3);
    }

    CollectionLists c = new CollectionLists();

    private void Movies() {

        Movie firstMovie = new Movie("Interstellar", "Christian Nolan", 2014, "7.72");

        MovieArrayList.add(firstMovie);
        MovieLinkedList.add(firstMovie);
        MovieHashSet.add(firstMovie);
        MovieTreeSet.add(firstMovie);
        MovieHashMap.put(1, firstMovie);
        MovieTreeMap.put(1, firstMovie);

        Movie secondMovie = new Movie("Dune", "Denis Villeneuve", 2021, "7.81");

        MovieArrayList.add(secondMovie);
        MovieLinkedList.add(secondMovie);
        MovieHashSet.add(secondMovie);
        MovieTreeSet.add(secondMovie);
        MovieHashMap.put(2, secondMovie);
        MovieTreeMap.put(2, secondMovie);


        Movie thirdMovie = new Movie("Heat", "Michael Mann", 1995, "8.01");

        MovieArrayList.add(thirdMovie);
        MovieLinkedList.add(thirdMovie);
        MovieHashSet.add(thirdMovie);
        MovieTreeSet.add(thirdMovie);
        MovieHashMap.put(3, thirdMovie);
        MovieTreeMap.put(3, thirdMovie);

        Movie fourthMovie = new Movie("Transformers", "Michael Bay", 2007, "7.55");

        MovieArrayList.add(fourthMovie);
        MovieLinkedList.add(fourthMovie);
        MovieHashSet.add(fourthMovie);
        MovieTreeSet.add(fourthMovie);
        MovieHashMap.put(4, fourthMovie);
        MovieTreeMap.put(4, fourthMovie);


        Movie fifthMovie = new Movie("Cars", "John Lasseter", 2006, "7.47");

        MovieArrayList.add(fifthMovie);
        MovieLinkedList.add(fifthMovie);
        MovieHashSet.add(fifthMovie);
        MovieTreeSet.add(fifthMovie);
        MovieHashMap.put(5, fifthMovie);
        MovieTreeMap.put(5, fifthMovie);
    }

    private void show() {
        Scanner s = new Scanner(System.in);
        String title = String.format("|%10s|%10s|%5s|%10s|", "Movie Name", "Producer Name", "Release Date", "Global Ratings");
        String odd = "----------------------------------------";
        System.out.println(collectionChoice);

        int choice = s.nextInt();

        switch (choice) {

            case 1:

                System.out.println(title);
                System.out.println(odd);

                for (var movie : MovieArrayList) {
                    String output = String.format("|%10s|%10s|%10d|%10s|", movie.getMovieName(), movie.getProducerName(), movie.getReleaseDate(), movie.getGlobalRatings());

                    System.out.println(output);
                    System.out.println(odd);
                }
                break;

            case 2:

                System.out.println(title);
                System.out.println(odd);

                for (var movie : MovieLinkedList) {
                    String output = String.format("|%10s|%10s|%5d|%10s|", movie.getMovieName(), movie.getProducerName(), movie.getReleaseDate(), movie.getGlobalRatings());

                    System.out.println(output);
                    System.out.println(odd);
                }
                break;

            case 3:

                System.out.println(title);
                System.out.println(odd);

                for (var movie : MovieHashSet) {
                    String output = String.format("|%10s|%10s|%5d|%10s|", movie.getMovieName(), movie.getProducerName(), movie.getReleaseDate(), movie.getGlobalRatings());

                    System.out.println(output);
                    System.out.println(odd);
                }
                break;

            case 4:

                System.out.println(title);
                System.out.println(odd);

                for (var movie : MovieTreeSet) {
                    String output = String.format("|%10s|%10s|%5d|%10s|", movie.getMovieName(), movie.getProducerName(), movie.getReleaseDate(), movie.getGlobalRatings());

                    System.out.println(output);
                    System.out.println(odd);
                }
                break;

            case 5:

                System.out.println(title);
                System.out.println(odd);

                for (int i = 1; i <= MovieHashMap.size(); i++) {
                    String output = String.format("|%10s|%10s|%5d|%10s|", MovieHashMap.get(i).getMovieName(), MovieHashMap.get(i).getProducerName(), MovieHashMap.get(i).getReleaseDate(), MovieHashMap.get(i).getGlobalRatings());

                    System.out.println(output);
                    System.out.println(odd);
                }
                break;

            case 6:

                System.out.println(title);
                System.out.println(odd);

                for (int i = 1; i <= MovieTreeMap.size(); i++) {
                    String output = String.format("|%10s|%10s|%5d|%10s|", MovieHashMap.get(i).getMovieName(), MovieHashMap.get(i).getProducerName(), MovieHashMap.get(i).getReleaseDate(), MovieHashMap.get(i).getGlobalRatings());

                    System.out.println(output);
                    System.out.println(odd);
                }
                break;
        }
    }

    private void remove() {
        Random rand = new Random();

        System.out.println(collectionChoice);

        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();

        int collectionChoice = 0;

        switch (choice) {
            case 1:

                if (MovieArrayList.size() > 0) {
                    collectionChoice = rand.nextInt(MovieArrayList.size());
                    MovieArrayList.remove(collectionChoice);
                } else
                    System.out.println("Error, size is insufficient");

                break;

            case 2:

                if (MovieLinkedList.size() > 0) {
                    collectionChoice = rand.nextInt(MovieLinkedList.size());
                    MovieLinkedList.remove(collectionChoice);
                } else
                    System.out.println("Error, size is insufficient");

                break;

            case 3:

                if (MovieHashSet.size() > 0) {
                    collectionChoice = rand.nextInt(MovieHashSet.size());

                    Iterator<Movie> iterHashSet = MovieHashSet.iterator();

                    for (int i = 0; i < MovieHashSet.size(); ) {
                        while (iterHashSet.hasNext()) {
                            Movie next = iterHashSet.next();

                            if (i == collectionChoice) {
                                iterHashSet.remove();
                            }
                            i++;
                        }
                    }
                } else
                    System.out.println("Error, size is insufficient");

                break;

            case 4:
                if (c.MovieTreeSet.size() > 0) {
                    collectionChoice = rand.nextInt(MovieTreeSet.size());

                    Iterator<Movie> iterTreeSet = MovieTreeSet.iterator();

                    for (int i = 0; i < MovieTreeSet.size(); ) {
                        while (iterTreeSet.hasNext()) {

                            Movie next = iterTreeSet.next();

                            if (i == collectionChoice) {
                                iterTreeSet.remove();
                            }

                            i++;
                        }
                    }
                } else
                    System.out.println("Error, size is insufficient");

                break;

            case 5:

                if (MovieHashMap.size() > 0) {
                    collectionChoice = rand.nextInt(MovieHashMap.size());
                    MovieHashMap.remove(collectionChoice);
                } else
                    System.out.println("Error, size is insufficient");

                break;

            case 6:
                if (MovieTreeMap.size() > 0) {
                    collectionChoice = rand.nextInt(MovieTreeMap.size());
                    MovieTreeMap.remove(collectionChoice);
                } else
                    System.out.println("Error, size is insufficient");

                break;

        }
    }







}

