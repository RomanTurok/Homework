package Lesson19;

import java.util.*;

public class Collections {


    private final Set<Integer> hashSetCollection = new HashSet<>();
    private final Set<Integer> linkedHashSetCollection = new LinkedHashSet<>();
    private final Set<Integer> treeSetCollection = new TreeSet<>();

    private static int SET_SIZE = 50;

    public Collections(){
        fillToHashSetRandomNumbers();
        fillToLinkedHashSetRandomNumbers();
        fillToTreeSetRandomNumbers();
    }

    public Set<Integer> getHashSetCollection() {
        return hashSetCollection;
    }

    public Set<Integer> getLinkedHashSetCollection() {
        return linkedHashSetCollection;
    }

    public Set<Integer> getTreeSetCollection() {
        return treeSetCollection;
    }

    public void fillToHashSetRandomNumbers(){
        Random r1 = new Random();
        for (int i = 0; i < SET_SIZE; i++) {
            hashSetCollection.add(r1.nextInt(1,50));
        }
    }

    public void fillToLinkedHashSetRandomNumbers(){
        Random r1 = new Random();
        for (int i = 0; i < SET_SIZE; i++) {
            linkedHashSetCollection.add(r1.nextInt(1,50));
        }
    }
    
    public void fillToTreeSetRandomNumbers(){
        Random r1 = new Random();
        for (int i = 0; i < SET_SIZE; i++) {
            treeSetCollection.add(r1.nextInt(1,50));

        }
    }
}
