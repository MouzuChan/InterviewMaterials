1.集合类型
  collection包括list(有序可重复)和set(无序不可重复)。
  list类型有ArraryList和LinkList,其中ArraryList根据索引进行排序，底层是基于动态数组，有利
  快速访问，LinkList底层基于双向链表实现的。set类型有hashset和treeset,hashset底层是哈希散列表，允许null值，要求放入的对象必须实现hashcode,
  treeset底层是基于二叉树实现，可实现元素排序，但不能放入null值。
  map包括hashtable、hashmap和treemap.
  hashtable继承自dictionary类(已被废弃)，不支持null key和null value,线程安全；hashmap继承自AbstractMap类，只支持一个null key，线程不安全(
  jdk1.5后可用线程安全的currentHashMap代替)；treeMap继承自sortedMap,线程不安全，底层基于红黑树实现，通过实现comparable或comparetor接口排序。
