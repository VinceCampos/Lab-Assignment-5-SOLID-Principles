public class OrderTest {

    public static void main(String[] args) {

        GenerateOrder order = new OrderAction();
        order.calculateTotal(25.0, 5);
        order.placeOrder("Lars Santiago", "12th E.Rodriguez St.");

        GenerateInterface generate = new OrderAction();
        generate.generateInvoice("order_567.pdf");

        Sendable send = new OrderAction();
        send.sendEmailNotification("lars@santiago.com");

    }
  }