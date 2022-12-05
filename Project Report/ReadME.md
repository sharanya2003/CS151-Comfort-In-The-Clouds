# ✈ --- ✈ CS151-Comfort-In-The-Clouds ✈ --- ✈

<br />
 ✈ --- ✈ Sharanya Udupa, Keerthanaa Ellur, Mohd Ifranul Hoque • Group #8  ✈ --- ✈ 
           
              
                     
<br />
              
☁ ☁ ☁
         

**Creating a user-friendly application to construct and organize typical airplane seating arrangements.**

<br /><br />
_Team members working on the proposal and their contributions in detail_

</br>
</br>

Keerthanaa gave inputs on ideas about airline seat reservation and researched github readme writing and formatting syntax which was made use during the proposal, 
and Project report. Keerthanaa also created the sequence diagram and was responsible for writing the ReadMe file for the descriptions of all the UML diagrams. 
<br/>
<br/>
Mohammad gave inputs on how the food plan could be implemented, he also suggested the seats being in a gridlayout. He was responsible for suggesting java swing to use for the front end. In terms of UML diagrams Mohammad worked on the state-UML diagram which exhibits the idea of how the project actually runs and what would happen if the project receives an error. Besides the state- UML diagram, Mohammad also helped to create Class-UML diagrams and UseCase-UML diagrams as well.  
<br/>
<br/>
In the proposal, Sharanya was specifically in charge of gathering in the teammates ideas and developing it furthermore design wise and coding wise. In addition she came up with other features developed in the final product. One of these features was the concept of seat value. Each seat had a different price value depending on whether it was a first class seat, a business class seat, a window seat, or a long-leg aisle seat. In order to put the airline customers and the airline employer’s needs first, we wanted to design an application that displays and incorporates all necessary information for the users in order for a smoother and convenient flight experience. As a result, Sharanya incorporated my team member’s ideas for the application by flushing out step by step what features and pages the user would be exposed to when interacting with the application  starting from the welcome page all the way to the survey page. In terms of UML diagrams, Sharanya worked on the Class Diagrams where we described the structure of the airplane seat manager. The class diagram layed out how we will break down and organize the application. For example, the Seat class was made to be an abstract class that holds all the seat information, which is inherited by the Business Seat, First Seat, and Economy Seat so we will be able to construct organized and concise polymorphic code. Next, Sharanya also worked on the Use Case Diagram which is when you organize and categorize all the different uses for a product, and what part of the product would be used by the different types of users (customers and employees) and what information the application would receive and store.

<br /><br />
_Team members working on the project presentation and their contributions in detail_
</br>
</br>

Keerthanaa was responsible for introducing the application in the presentation. She spoke about the intentions of the application. She also organized the slides 
and added information regarding the subject.
</br> 
<br />
Mohammad was responsible for explaining the functionality, operations of the project and also about the environment they chose and the basis of choosing those environments. He also created multiple speaker notes and slides for the project to become more coherent. 
</br>
<br />
In the project presentation, Sharanya Udupa was in charge of delegating tasks for the rest of the team, and helped them brainstorm what should be added and what shouldn't be added to the slide show presentation. In addition, since she was the main person working on the code for the project, she also took over all the technical details covered in the presentation. This included explaining the different types of Object Oriented Concepts applied in the application (Inheritance, Polymorphism, Abstraction,  Exception Handling, GUI usage, and Design Patterns). Finally, Sharanya organized the slides once all the other teammates completed their tasks so the presentation was more visually appealing and digestible for the audience.

<br /><br />
_Team members working on the project (code) and report. Mention their contributions in detail_
</br><br />
Keerthanaa added foodPlan method in the GUIDevelopment class which enables the user to select a food plan of their choice. 
When the user selects their choice, a message shows up stating their choice. The foodPlan panel also has a button which then leads the user to the survey page.
<br />
<br />
Mohammad added the survey method in the GUIDevelopment class which enables the users to write a comment about the application and proceed to the final panel where they receive a confirmation of their seat being booked and also have the option to SignUp / logIn again for booking more seats for the same user or different user. He also worked on multiple edge cases as well.
<br />
<br />
Sharanya worked on all the code prior to the project presentation (all the content covered in the project presentation). This includes the welcome page, the sign up page, the sign in page, the airplane seat manager page, and the specific airplane seat information displayed in a popup browser. In addition to the UI for all of these pages, Sharanya developed the OOP/ backend part of the application. For example, Sharanya created a Person class that contained all the information the user entered in the Signup/login information and saved it into a file using serializable. Next, to create a functioning airplane seat plane that held different perks and drawbacks for each seat, Sharanya had to implement the majority of the OOP concepts to be able to create organized, concise, and digestible code. She implemented the Factory Design Pattern and the MVC Design Pattern which will be later covered in detail in the report. Sharanya used the MVC design pattern to make the popup browser appear and change the color of the seat when the user interacts a certain way with the application. The popup browser displayed important information regarding the seat like the name of the person who booked the seat (visible depending on if they successfully purchased that seat or not), the pricing of the seat and the reason behind the pricing (type of class, window, and long-leg), the food plan (no interactive food plan choice during the time of the presentation), the carry-on, and other prevalent information. Finally, Sharanya used the Factory Design pattern to visually construct the 2-D array of seat objects and to create a specific seat depending on the positioning of the seat (determined by the row and column of the seat). In the Project Report, Sharanya was in charge of writing her own contributions to the project (proposal, project presentation, and code), problem/issue and solution to both, steps to running the code, and the references used when creating Comfort In Clouds.

<br /><br />
_Problem/ issue_
<br />
Problem Creating the Airplane Board and Solution: The main problem statement for this application was to create the seat manager application (the 2-D array of buttons that represent a specific instance of a Seat class. The type of seat class: BusinessSeat, EconomySeat, and FirstSeat, depended on the location of the seats which were properly displayed using the GridBagLayout feature in the GUIDevelopment class. In addition to the type of seat, the application had to store other information like weather its a window seat or a long-leg, food plan, carry-on, and the customer’s name and pin if the seat was taken. This problem was easily resolved and much more obvious to conceptualize when using the Factory Design Pattern. The Factory design pattern allowed me to make the subclasses (BusinessSeat, EconomySeat, and FirstSeat) choose the type of object to be created, allowed for loose-coupling so I could give the specific information about the Seat when I had the data ready to give it, and finally it let me push many of the logic in some classes, allowing me to create simplistic and literal code in other class. We broke up our application into a Factory method by first creating an AirplaneBoard which creates seats using the length of the GUI board and calls the SeatFactory class that makes each seat unique depending on position. The AirplaneBoard class is only an eight-liner code, which further shows the simplicity I was able to create when using the Factory method. Next,  the SeatFactory class creates a desired seat depending on the position of the seat (row and column). Doing so hides the logic of object creation from the user. Finally, the Seat class is an abstract class that delegates all the properties that make a Seat unique.
<br />
Issue Changing the State of a Seat and Solution: When creating the Seat Management application, one of the main issues I encountered was how to change the user interface (seat button turns red when reserved and seat button turns back to green when canceled) depending on how the user interacted with the application. I then realized, this was possible and much more organized the frontend and the backend using MVC Design Pattern (Model View Control). The Model only contains the application data. In other words, it contains all the logic for which seat gets which amenities (price and luggage amount, etc) is made in the Seat Factory and Seat class. The View presents Model’s data to the user using GUI. In this case, the View turns red if it's reserved, stays green if it's open, and turns from red to green if it is canceled. Finally, the Control part of the MVC makes mutations of the object or class. In this case, Control is manipulating the current state of a seat: if it is reserved or not reserved and notifies the rest about the reservation, which is mainly found in the BaseModel and SeatInfo classes. The BaseModel class held methods like dispath() and add() which alerted the rest of the application (like the UI) on a add or change to a specific seat, so the other parts can react accordingly. For example, if there was a cancelation, dispath() will alert that you need to change the seat color from green to red and forget the user information allocated with that seat. Next, the SeatInfo class held methods that were in charge of direct manipulation to the Seat information. Specifically, the reserve() and cancel() methods had the logic of how a seat should react when the "Reserved" button is clicked versus when a "Cancel" button is clicked

<br /><br />
_assumptions / operating environments / intended usage_
<br />
<br />
Assumptions: our assumption was to create a user-friendly airplane seat management system.
<br />
<br />
Operating environments: for the front end, we have used Java swing and for the back end we have used Java. We chose java swing because java swing is a part of java foundation class, which is why it was easier for us to combine the front and the back end.
<br />
<br />
_Intended usage_:
* Log In/Sign-up
* Choose comfort priority
* Choose seating
* Proceed to food plan
* Fill out Customer Review (Comments)



<br /><br />
_Steps to run your code_: 
<br />
On GitHub.com, navigate to the main page of the CS151-Comfort-In-The-Clouds repository. Click the Code button at the top right hand side of the page and copy the HTTPS link given to clone the repository. Using the Command Prompt or Terminal to clone the project onto your local device. Then, open up any IDE that runs Java (we used Eclipse) into the folder that holds the cloned code and run the application!


<br /><br />
_Diagrams_:
* [Class](https://github.com/sharanya2003/CS151-Comfort-In-The-Clouds/blob/55d126d5e1a8597c6a7b3b0f04a2ffe680492647/diagrams/ComfortInTheClouds-ClassDiag.png) 
* [Use Case](https://github.com/sharanya2003/CS151-Comfort-In-The-Clouds/blob/main/diagrams/ComfortInTheClouds-UseCaseDiagram.JPG)
* [State](https://github.com/sharanya2003/CS151-Comfort-In-The-Clouds/blob/main/diagrams/ComfortInTheClouds-StateDiagram.png) 
* [Sequence](https://github.com/sharanya2003/CS151-Comfort-In-The-Clouds/blob/main/diagrams/ComfortInTheClouds-UpdatedSequenceDiagram.png)


<br /><br />
_Functionality_:
<br />
* Our solution assists users to choose their desired seat with option to choose their desired food plan
* For the sake of security ,we make our users type their passwords while booking each seat, in order to confirm their reservation.
* Users also have the option to choose food plans after booking their seats.
* If the user decides to change his/her mind regarding the seat reservation, He/she can navigate back to the seatManager panel and cancel the seat reservation.
* Users are encouraged to leave a comment about their experience and recommendations, which will help us to improve our application.
* Finally, the user receives a confirmation of their seat reservation and has the option to book more seats if they desire.
<br />



_Operations_:
* In the welcome page, the user is at first greeted with a short overview of the application and then has the option to choose between sign up & login. 
* In the SignUp page, the user enters their personal information such as  first name, last name, Email, Password and Retype password. And after going through the sign up page we move on to the login page.
* In the Login page, the user enters their full name and the password they provided in the Sign Up page
* Once they are logged in, they are then redirected to the seat reservation page where there are 4 rows and 12 columns of seats with their designated classes namely First Class, Business Class, Economy Class. 
  * The Empty seats are labeled as green while as the booked seats are labeled as red
  * The user can reserve multiple empty seats.
  * Once the user clicks on any empty green colored seat, they will receive a pop up with Specific information. In order to reserve their seats, the user would have to enter the password that they used for logging in.
  * If the user decides to cancel a booking, they would have to click on the seat that they have booked and re-enter the password in order to cancel their booking. 
* When the user is done selecting their seats, they are then led to the food plan page. The user has the opportunity to select their food preferences such as vegetarian, gluten free or the default food option.
* Then when the user selects the survey button, they are directed to the survey page where the user can comment about their experience in booking the seat. 
* The users are redirected to the home page where new users can sign-up/login. The new users can see other user’s seat bookings which prevents them from selecting those seats. 


_Snapshot of the running program_:
![WelcomePage](https://user-images.githubusercontent.com/57739452/205567965-f7c8c274-7015-4e89-8882-c67ec6024057.JPG)
![SignupPage](https://user-images.githubusercontent.com/57739452/205568001-5dfffdc8-ba68-4066-8dd0-858d534f002a.JPG)
![LoginPage](https://user-images.githubusercontent.com/57739452/205568022-c6294c1a-21fe-4de8-ac93-045a6a8aa965.JPG)
![SeatManagerPage](https://user-images.githubusercontent.com/57739452/205568054-939e5291-7d9e-46d7-9263-d401e45dc0dd.JPG)
![SeatReservationPopUp](https://user-images.githubusercontent.com/57739452/205568069-ec01f31f-98aa-4d87-b34e-fea3aedc2d05.JPG)
![FoodPlanPage](https://user-images.githubusercontent.com/57739452/205568139-6a0f9ecd-703b-411d-b5fd-07c5f1f58181.JPG)
![SurveyPage](https://user-images.githubusercontent.com/57739452/205568154-4cdf7dcf-b82b-4b1b-abe5-2e68c69c4f10.JPG)
![ConfirmationPage](https://user-images.githubusercontent.com/57739452/205568174-d30df99b-b269-4f81-be3e-fc7f3f7ded0f.JPG)
![User2SigninPage](https://user-images.githubusercontent.com/57739452/205569260-7ee8ef02-1d8b-459c-aa85-2ca5a72a67a4.JPG)
![User2LoginPage](https://user-images.githubusercontent.com/57739452/205569285-c997e4cf-e015-44d7-9156-7ac631195179.JPG)
![User2SeatManagerPage](https://user-images.githubusercontent.com/57739452/205569313-7da0660f-7291-4a01-aa81-85dd636f91e7.JPG)
![User2FoodPlanPage](https://user-images.githubusercontent.com/57739452/205569341-ed66c988-fb97-4d03-81bc-19b14bc723e5.JPG)
![User2SurveyPage](https://user-images.githubusercontent.com/57739452/205569366-d12901a7-935f-476b-adf4-53b3c1bfb885.JPG)
![User2ConfirmationPage](https://user-images.githubusercontent.com/57739452/205569401-76496a6a-b698-44ee-b1b0-7358f6aa2974.JPG)


<br /> <br />
<br />
_References_: <br />
[1] https://www.youtube.com/watch?v=Kmgo00avvEw&t=1085s&ab_channel=BroCode <br />
[2] https://code-projects.org/simple-parking-lot-in-javascript-with-source-code/ <br />
[3]https://stackoverflow.com/questions/17293991/how-to-write-and-read-java-serialized-objects-into-a-file <br />
[4]https://stackoverflow.com/questions/22638926/how-to-put-hover-effect-on-jbutton <br />
[5]https://stackoverflow.com/questions/11165323/how-do-i-use-gridbaylayout-in-java-swing-to-generate-this-particular-image-in <br />


☁ ☁ ☁
