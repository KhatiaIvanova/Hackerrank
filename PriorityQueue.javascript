class Element {
    constructor(element, priority)
    {
        this.element = element;
        this.priority = priority;
    }
}
class PriorityQueue {
 
    // An array is used to implement priority
    constructor()
    {
        this.items = [];
    }
 
    // functions to be implemented
    // enqueue(item, priority)
    // dequeue()
    // front()
}

// enqueue function to add element
// to the queue as per priority
enqueue(element, priority)
{
	// creating object from queue element
	var element = new Element(element, priority);
	var contains = false;

	for (var i = 0; i < this.items.length; i++) {
		if (this.items[i].priority > element.priority) {
			this.items.splice(i, 0, element);
			contains = true;
			break;
		}
	}
	if (!contains) {
		this.items.push(qElement);
	}
}
//returns and removes element
dequeue()
{
    if (this.isEmpty())  return "No elemenets Found";
    return this.items.shift();
}
//returns and don't remove element
front()
{ 
    if (this.isEmpty()) return "No elemenets Found";
    return this.items[0];
}
