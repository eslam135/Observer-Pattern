# <span style = "color:cyan" > Observer-Pattern 

## <span style = "color:pink" >What are Observer Patterns? 

### <span style="color:lightgrey"> The Observer pattern is a behavioral design pattern that establishes a one-to-many relationship between a subject (or observable) and its observers. When the state of the subject changes, it notifies all of its observers, allowing them to react accordingly.

## <span style = "color:pink" >Why is it used?</span>

### <span style="color:lightgrey"> Assuming three bodies "A,B,and C" where B and C are in a 1:N relation with A, In normal cases B and C will always try to know the state of body A, by polling this state every period of time which results in high traffic while the system is working, The observer pattern solves this problem by "observing" the state of A and making it responsible for pushing the new state to the subscribers by its own.

## <span style = "color:pink" > How does it work?

### <span style="color:lightgrey"> 1- Create the Subject interface or class:
The Subject represents the object that is being observed. It defines the methods for registering, unregistering, and notifying observers. This interface or class maintains a list of observers and notifies them when there are changes in its state.

### <span style="color:lightgrey"> 2- Create the Observer interface or class:
The Observer represents the objects that are interested in observing the changes in the subject. It defines the method(s) that will be called when the state of the subject changes. Observers can perform actions based on the updated state.

### <span style="color:lightgrey"> 3- Register observers with the subject:
Observers need to register themselves with the subject in order to receive notifications. This is typically done by calling a register method on the subject and passing the observer object as a parameter.

### <span style="color:lightgrey"> 4-Define the update method:
The observer class must implement the update method from the Observer interface. This method will be called by the subject whenever there are changes in its state. The update method typically takes the updated information as a parameter.

### <span style="color:lightgrey"> 5- Notify observers of state changes:
When the state of the subject changes, it needs to notify all the registered observers. This is done by calling the notifyObservers method on the subject. The subject iterates through the list of observers and calls the update method on each observer, passing the updated information as a parameter.

### <span style="color:lightgrey"> 5- Observers react to state changes:
Each observer, upon receiving the update notification, can perform actions based on the updated state of the subject. The specific actions taken by observers will depend on the requirements of the application.

    +----------------------+               +----------------------------+
    |   Subject            |<>-------------|   NewsAgency               |
    +----------------------+               +----------------------------+
    |                      |               | -observers: List<Observer> |
    | +registerObserver()  |               | -news: String              |
    | +unregisterObserver()|               | +setNews()                 |
    | +notifyObservers()   |               +----------------------------+
    |                      |
    +----------------------+
              ^
              |
              |
    +----------------+
    |    Observer    |
    +----------------+
    | +update()      |
    |                |
    +----------------+
              ^
              |
              |
    +----------------+
    |  NewsChannel   |
    +----------------+
    | -news: String  |
    | +update()      |
    | +getNews()     |
    +----------------+
