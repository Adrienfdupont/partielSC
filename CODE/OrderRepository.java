public class OrderRepository implements IManageOrders {
    private Map<Integer, List<String>> orderList = new HashMap<>();

    @Override
    public Order addNewItem(int orderId, String itemName) {
        List<String> items = orderList.getOrDefault(orderId, new ArrayList<>());
        items.add(itemName);
        orderList.put(orderId, items);
        return new Order(orderId, items);
    }

    @Override
    public Order renameItem(int orderId, String itemName, String newItemName) {
        List<String> items = orderList.get(orderId);
        if (items != null) {
            int index = items.indexOf(itemName);
            if (index != -1) {
                items.set(index, newItemName);
            }
        }
        return new Order(orderId, items);
    }

    @Override
    public Order removeItem(int orderId, int itemName) {
        List<String> items = orderList.remove(orderId);
        return new Order(orderId, items);
    }

    public List<String> getItems(int orderId) {
        return orderList.get(orderId);
    }
}