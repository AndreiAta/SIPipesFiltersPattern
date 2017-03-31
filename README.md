# Pipes and Filters Pattern

The purpose of this repository is demonstrating a simplified version 
of the Pipes and Filters Pattern used in system integration. 

>For more info check out this complete list of 
[enterprise integration patterns](http://www.enterpriseintegrationpatterns.com/patterns/messaging/ "Enterprise Integration Messaging Patterns")

## Problem statement
The problem of performing complex processing on a message affects developers attempting to integrate systems. The impact of this problem is hard maintainability and flexibility.

A successful solution is to break down this process 
into a set of separate independent components **(Filters)** 
each performing its own task and connect them through channels **(Pipes)**.

## Diagram
The diagram shows the filters and pipes 
for our Online Chat application.

![alt tag](http://i.imgur.com/kYriPy4.png)

There are several message filtering requirements that must be met:
* Removal or censorship of messages with inappropriate language.
* Emoji insertion instead of certain strings sequences such as *;)*, *:(* etc.
* First letter of message should be capitalized

## Short description

**Pipes** connect and send output messages from one filter to the next.

Each **filter** exposes a very simple interface: 
* it receives messages on the **inbound pipe**, 
* processes the message, 
* and publishes the results to the **outbound pipe**. 

Since all filters share the same interface they can be connected to different pipes. Therefore, the main benefit of this pattern is flexibility 
because we can simply remove or add available filters  
and compose different solutions.



