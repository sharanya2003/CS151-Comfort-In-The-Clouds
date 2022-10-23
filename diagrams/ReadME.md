# ✈ --- ✈ CS151-Comfort-In-The-Clouds ✈ --- ✈

<br />
 ✈ --- ✈ Sharanya Udupa, Keerthanaa Ellur, Mohd Ifranul Hoque • Group #8  ✈ --- ✈ 
           
              
                     
<br />
              
☁ ☁ ☁
         

**Creating an UML diagram to construct and organize typical airplane seating arrangements.**

| Diagram       | Description                                                                    | 
| ------------- |:-------------:                                                                 | 
| [Class] (https://github.com/sharanya2003/CS151-Comfort-In-The-Clouds/blob/55d126d5e1a8597c6a7b3b0f04a2ffe680492647/diagrams/ComfortInTheClouds-ClassDiag.png)         | There is an abstract `Airplane` class that counts the number of luggages, tickets, FoodPlan, which implements enum position and FoodPlan. The `position` class has different comfort seating options. The `FoodPlan` class makes sure that the food plan dietary changes are catered according to the seating chart. The `Airplane` class is extended by the `business`, `economy` and `first` class                 | 
| Use Case      | centered                                                                       |   
| State         | We start by entering into the application. The customer either logins in or signs up to their account. They provide different information based on signing up or logging in. If the user provides wrong info, they have to retry. If it succeeds it leads to the home page. User selects their prefered seating options business, economy or first class. Then they select their preferred position which is the aisle, middle, window, or the long-leg seat. They then are opted towards luggage section where they enter the number they have. They provide their bank details and are proceeded towards an optional survey. If there is an error in the transaction, error is thrown and are proceeded back to the home page. If all goes well, they are provided with a confirmation and are proceeded towards a home page.                                                                       | 
| Timing        |                                                                                |
