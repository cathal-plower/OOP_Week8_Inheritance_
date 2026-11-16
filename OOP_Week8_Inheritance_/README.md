1. Which constructor initialises the inherited fields?
   The Person constructor initialises name, address, and phoneNumber using super()
2. Why does second.setName("Bob Jones") work?
   Because Customer inherits the setName() method from Person.
3. What is the purpose of super.toString()?
   It reuses the Person toString() output and adds the Customer fields.

4. Which constructor initialises the common fields, and which initialises studentId?
   The Ticket constructor initialises the common fields  through the super() call.
   The StudentTicket constructor then initialises the studentId field using this.studentId = studentId;

5. Design Question ?
   No as ticket cannot be both a StudentTicket and a VIPTicket at the same time.
   This shows that inheritance has limits because a class can only extend one other class.
----