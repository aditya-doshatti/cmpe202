CRC Cards

Table

Knows TableNumber

Knows TableCapacity

Knows TableAvailiability

Can make table allocated [unavailabe] : AllocateTable

Can make table vacant [available] : VacateTable

Customer

Knows PhoneNumber

Knows CustomerName

Knows PartySize

Manager

Knows Customer List : Customer

Can Register a Customer : System

Can Deregister a Customer : System

Restaurant

Knows Table list and count : Table

Can add table : Table

Can remove Table: Table

System

Can get the customer details : Customer

Can get the details of Tables : restaurant

Can maintain a queue and allocate table and send message to customer and allocate table: Customer, Manager, restaurant, AllocateTable

Get response from Customer and remove customer from queue and vacate table : Customer, Manager, restaurant, VacateTable

AllocateTable

Execute command : Table

VacateTable

Execute command : Table

Pattern Used: Command Pattern

Command Classes : AllocateTable, VacateTable [Commands which are to be executed]

Request Class : Table [As the request is to get table]

Invoker Class : System

I have used command pattern because here we have two commands to be processed on Table and the invoker need not to have any information about table and what the command is and all data related to command, we have to do this according to the data of customer and its party size. Using any other pattern we would had to have more than 1 design pattern to maitain the Tables and Customers, here the System is able to handle everything by just giving the command to Table to make itself available/unavialable.
