## HashMap Implementation

## `set(K key, V value)`

**Approach**:
- The `set` method is used to add or update a key-value pair in the hash map.
- It calculates the hash of the key to determine the index (bucket) where the key-value pair should be stored.
- It then iterates over the linked list (the bucket) at the specified index.
- If it finds a key that matches the provided key, it updates the associated value.
- If no matching key is found in the bucket, a new key-value pair is added to the bucket.

**Efficiency**:
- Time Complexity: O(N) in the worst case, where N is the number of key-value pairs in the hash map. This is because, in the worst case, all N pairs must be checked to find a match.
- Space Complexity: O(1), as it does not create additional data structures that depend on the input size.

## `get(K key)`

**Approach**:
- The `get` method is used to retrieve the value associated with a given key.
- It calculates the hash of the key to determine the index (bucket) where the key-value pair might be stored.
- It then iterates over the linked list (the bucket) at the specified index.
- If it finds a key that matches the provided key, it returns the associated value.
- If no matching key is found, it returns `null`.

**Efficiency**:
- Time Complexity: O(N) in the worst case, where N is the number of key-value pairs in the hash map. This is because, in the worst case, all N pairs must be checked to find a match.
- Space Complexity: O(1), as it does not create additional data structures that depend on the input size.

## `contains(K key)`

**Approach**:
- The `contains` method checks if a given key exists in the hash map.
- It calculates the hash of the key to determine the index (bucket) where the key might be stored.
- It then iterates over the linked list (the bucket) at the specified index.
- If it finds a key that matches the provided key, it returns `true`.
- If no matching key is found, it returns `false`.

**Efficiency**:
- Time Complexity: O(N) in the worst case, where N is the number of key-value pairs in the hash map. This is because, in the worst case, all N pairs must be checked to find a match.
- Space Complexity: O(1), as it does not create additional data structures that depend on the input size.

## `keys()`

**Approach**:
- The `keys` method is used to retrieve a list of all keys stored in the hash map.
- It iterates over each bucket and then iterates over the linked list in each bucket, collecting all keys into a list.

**Efficiency**:
- Time Complexity: O(N) where N is the number of key-value pairs in the hash map. It needs to go through all pairs to collect the keys.
- Space Complexity: O(N) because it returns a list of all keys, and the space used is proportional to the number of keys in the map.

## `hash(K key)`

**Approach**:
- The `hash` method calculates a hash code for a given key using Java's `hashCode` method.
- It takes the absolute value of the hash code and calculates the remainder when divided by the size of the hash map (the number of buckets) to determine the bucket index where the key should be stored.

**Efficiency**:
- Time Complexity: O(1), because it performs a fixed number of operations regardless of the input size.
- Space Complexity: O(1), as it does not create additional data structures that depend on the input size.

