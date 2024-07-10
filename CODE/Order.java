public class Order implements IManageOrders {
    private int orderId;        
    private int customerID;
    private List<String> itemList;
    private OrderRepository orderRepository;

    public Order(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order addNewItem(int orderId, String itemName) {
        orderRepository.addNewItem(orderId, itemName);
    }

    @Override
    public Order renameItem(int orderId, String itemName, String newItemName) {
        return orderRepository.renameItem(orderId, itemName, newItemName);
    }

    @Override
    public Order removeItem(int orderId, String itemName) {
        return orderRepository.removeItem(orderId, itemName);
    }

    public void listItems() {
        List<String> items = orderRepository.getItems(orderId);
        for (String item : items) {
            System.out.println("Customer ID: " + item.getCustomerID());
            System.out.println("Items: " + String.join(", ", item.getItems()));
            System.out.println();
        }
    }
}
