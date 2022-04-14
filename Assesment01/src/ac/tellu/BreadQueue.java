package ac.tellu;

import java.util.LinkedList;
import java.util.Queue;

public class BreadQueue {
    private Queue<BreadOrder> breadQueue = new LinkedList<BreadOrder>();

    public void takeNumber(BreadOrder bread) {
        if (!this.breadQueue.isEmpty())
            System.out.printf("Anda menunggu %d orang lagi\n", this.breadQueue.size());

        this.breadQueue.add(bread);
    }

    public void calling() {
        BreadOrder bread = this.breadQueue.poll();
        System.out.printf("Nomor %d : pembelian %s sudah siap.\n", bread.getQueueNumber(), bread.getBreadName());
    }
}
