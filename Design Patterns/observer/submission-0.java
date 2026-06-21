interface Observer {
    void notify(String itemName);
}

class Customer implements Observer {
    private String name;
    private int notifications;

    public Customer(String name) {
        this.name = name;
        this.notifications = 0;
    }

    public void notify(String itemName) {
        this.notifications += 1;
    }

    public int countNotifications() {
        return this.notifications;
    }
}

class OnlineStoreItem {
    private String itemName;
    private int stock;
    private List<Observer> notificationList;

    public OnlineStoreItem(String itemName, int stock) {
        this.itemName = itemName;
        this.stock = stock;
        this.notificationList = new ArrayList<>();
    }

    public void subscribe(Observer observer) {
        notificationList.add(observer);
    }

    public void unsubscribe(Observer observer) {
        notificationList.remove(observer);
    }

    public void updateStock(int newStock) {
        if(newStock-this.stock > 0){
            this.stock = newStock;
            for(Observer observer: this.notificationList){
                observer.notify(this.itemName);
            }
        }else{
            this.stock = newStock;
        }
    }
}
