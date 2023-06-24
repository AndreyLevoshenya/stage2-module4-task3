# Observer design pattern task

Implement Observer design pattern. 

### Written code overview

**RectangleRepository** is the rectangle's repository(com.mjs.stage2.repository), where rectangles saved.    
**RectangleWarehouse** is the rectangle's warehouse(com.mjs.stage2.repository),where rectangle values such as perimeter
and square saved such **RectangleValues**(com.mjs.stage2.entity) object by rectangleId like a key.  
**RectangleEvent** (com.mjs.stage2.event) it's event which send to the observer when the
value of one of rectangle sides changed.

## Task

When you get one of the rectangle objects from rectangles repository and change the
value of one of rectangle sides , then the RectangleObserver(com.mjs.stage2.impl) handle this event and the values in the rectangle warehouse
must be changed. Implement Observer and Observable interfaces where appropriate. 
  

