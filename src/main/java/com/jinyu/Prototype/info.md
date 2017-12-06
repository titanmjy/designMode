## 原型模式
实现java.lang.Cloneable接口，这是一个空接口，用于标识该类可以被clone
重写object对象的clone()方法，这个是具体的clone实现
默认的clone()方法实现，是直接在内存copy一个对象，快，且不执行构造函数.
但是这个copy是浅copy，对象不能被完全copy，有对象的话要手工copy对象

