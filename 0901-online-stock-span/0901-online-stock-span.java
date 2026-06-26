class StockSpanner {

    static class Pair {
        int price;
        int index;

        Pair(int price, int index) {
            this.price = price;
            this.index = index;
        }
    }

    Stack<Pair> st;
    int day;

    public StockSpanner() {
        st = new Stack<>();
        day = 0;
    }

    public int next(int price) {

        while (!st.isEmpty() && st.peek().price <= price) {
            st.pop();
        }

        int span;

        if (st.isEmpty()) {
            span = day + 1;
        } else {
            span = day - st.peek().index;
        }

        st.push(new Pair(price, day));

        day++;

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */