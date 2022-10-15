# ✈ --- ✈ --- ✈ CS151-Comfort-In-The-Clouds ✈ --- ✈ --- ✈ 

☁ ☁ ☁

**Creating a user-friendly application to construct and organize typical airplane seating arrangements.**


_Issues Tackled_:
* comfort priorities (window seating, aisle seating, long-leg seating, etc)
* seating placement (if there is an open seating at preferred location)
* luxury preferences (economy class, business class, first class)

_Technologies Used_:
* Front-end: JavaScript, HTML, CSS
* Back-end: Java
* Frameworks: SpringBoot
* Computing Platform: Swing GUI

_Java Object Oriented Programming and Data Structures Concepts Used_:
* Abstract Class: Airplane
* Inheritance: Economic, Business, First --> extends Airplane
* Enum: WINDOW, MIDDLE, AISLE
* Queue: Storing Customer's Requests (priority: first come first serve)
* HashMap: Customer to number of luggages
* 2-D Array: Layout of the airplane seat management system


☁ ☁ ☁
<br />
_Detailed Information About Our Projects_
</br>
There are many components when it comes to booking a flight. You need to think about a customer’s comfort priorities, seating placement, and luxury preferences. Our application's goal is to process more efficiently, user-friendly, and conveniently.There are many components when it comes to booking a flight. You need to think about a customer’s comfort priorities, seating placement, and luxury preferences. Our application's goal is to process more efficiently, user-friendly, and conveniently. Here, the user (typically an airplane check-in employee) will add in seating requests from the customer. If the airplane has seating space, our application will reserve a spot for the customer. This reservation is also found in our systematic UI that lays out all of the different features you can choose when you log in. The customer has an option to choose either first class, business class, or economy class. This will redirect them to the correct page where they can see the available seating of the whole airplane,and choose their desired spot. Keep in mind, there will be a few special seatings that will cost extra compared to that of a regular seating(ex. window seat and long-leg aisle). Once the customer chooses their spot, our application will decide whether it is a success and proceed to the payment. Our customer can now add available promo codes (hardcoded 5) for a 20% discount on the ticket. Now that the customer has successfully booked the flight, our application will ask the customer to give a rating out of 5 stars and write a review about their customer experience. Now our customer is ready to board to their final destination while having Comfort in the Clouds! In the future we hope to advance our application by adding a luggage storage feature which will keep track of all of the student’s carry-ons(including weight and number of baggage).
