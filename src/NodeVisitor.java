public abstract class NodeVisitor {
    public abstract Reminder visitProduct(ProductList product);
    public abstract void visitTrading(Trading trading);
    public abstract void visitFacade(Facade facade);
}

