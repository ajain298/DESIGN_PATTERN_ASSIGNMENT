public abstract class Reminder
{
    public abstract Reminder accept(NodeVisitor visitor);
    abstract Iterator getIterator(String type);

}
