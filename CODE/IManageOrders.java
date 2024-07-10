public interface IManageOrders {
    Order addNewItem(int orderId, String itemName);
    Order renameItem(int orderId, String ItemName, String newItemName);
    Order removeItem(int orderId, int itemName);
}