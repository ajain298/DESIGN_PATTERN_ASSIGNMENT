public interface Iterator
{
    public Offering Nexto(Iterator I);
    public Product Nextp(Iterator I);
    public abstract boolean hasNext(Iterator I);
    public abstract void MoveToHead(Iterator I);
    public abstract void Remove(Iterator I);
}
