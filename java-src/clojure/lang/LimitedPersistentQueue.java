package clojure.lang;

import clojure.lang.PersistentQueue;

public class LimitedPersistentQueue extends PersistentQueue {

	final int limit;

	public LimitedPersistentQueue(PersistentQueue q, int limit) {
		super(q.meta(), q.cnt, q.f, q.r);
		this.limit = limit;
	}

	public LimitedPersistentQueue(int limit) {
		super(null, 0, null, null);
		this.limit = limit;
	}

	public LimitedPersistentQueue cons(Object o) {
		PersistentQueue ret = super.cons(o);
		if (ret.count() > this.limit) {
			ret = ret.pop();
		}
		return new LimitedPersistentQueue(ret, this.limit);
	}
}
