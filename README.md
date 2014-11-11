# limited-persistent-queue

A Clojure library designed to add a subclass of
clojure.lang.PersistentQueue that limits the size of the queue.

## Usage

lpq = new LimitedPersistentQueue(5);

Creates a queue that will not grow beyond 5 items. Addition (via conj)
of additional items drops the first iteml

## License

Copyright © 2014 Indoles

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
