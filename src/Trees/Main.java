package Trees;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rank=2;
        int conter=0;
        int quantity=30;
        Tree<Integer, String> mtm = new Tree<>();
        Random Rnd=new Random();
//        проверка на тестовом массиве
                    mtm.put(5, "five");
                    mtm.put(1, "one");
                    mtm.put(3, "tree");
                    mtm.put(4, "four");
                    mtm.put(2, "two");
                    mtm.put(0, "null");
                    mtm.put(10, "ten");
                    mtm.put(12, "twelve ");
                    mtm.put(11, "eleven");
                    mtm.put(14, " ");
                    System.out.println( mtm.isBalanced(mtm.root,rank));

     Tree [] forest  =new Tree[quantity] ;

     for(int i=0;i<forest.length;i++){
         forest[i]=new Tree();

         for(int j=0;j<10;j++){
             forest[i].put((-(int)(Math.random()*200)+100)," ");
         }
        }

        for (Tree e:forest) {
          if ( e.isBalanced(e.root,rank) )
              conter++;
        }
        System.out.println("Количество сбалансированных деревьев = " +conter +" из "+quantity);



    }
}
