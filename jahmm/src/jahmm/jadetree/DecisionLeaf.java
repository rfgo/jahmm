package jahmm.jadetree;

/**
 *
 * @author kommusoft
 * @param <TSource>
 */
public interface DecisionLeaf<TSource> extends DecisionRealNode<TSource> {

    public void expandThis();

}
