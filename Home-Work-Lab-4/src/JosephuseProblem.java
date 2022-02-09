public class JosephuseProblem {
    CicleQueue<Integer> cicleQueue = new CicleQueue<>();

    public void Circle(int n, int p) {
        for (int i = 1; i <= n; i++) {
            cicleQueue.enqueue(i);
        }


        while (cicleQueue.size() > 1) {
            for (int i = 1; i <= p; i++) {
                if (i == p) {
                    System.out.println(cicleQueue.dequeue());
                    break;
                }
                cicleQueue.rotet();
            }

        }
            System.out.println("Size "+cicleQueue.size());
            System.out.println("winder "+cicleQueue.first());


    }

}
