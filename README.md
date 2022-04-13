# roundUp
a “round-up” feature for Starling customers using our public
developer API that is available to all customers and partners.
For a customer, take all the transactions in a given week and round them up to the nearest
pound. For example with spending of £4.35, £5.20 and £0.87, the round-up would be £1.58.
This amount should then be transferred into a savings goal, helping the customer save for
future adventures.

# To Build & Run
mvn clean build will run all generate an executable JAR. Before that you need to set up the application.property with the appropriate Bearer token.

# Development
I attempted to construct the resource following the current Starling API standards, which I discovered in your Swagger documentation at Starling API Docs. The round-up function will invoke by calling the rest API.

Example : 

curl --location --request PUT 'localhost:8080/api/v2/account/roundUp' \
--header 'Content-Type: application/json' \
--data-raw '{
    "accountUID": "bbccbbcc-bbcc-bbcc-bbcc-bbccbbccbbcc",
    "savingGoal": "bbccbbcc-bbcc-bbcc-bbcc-bbccbbccbbcc",
    "minTimestamp": "2022-03-11T04:21:33.575Z",
    "maxTimestamp": "2022-04-11T04:21:33.575Z"
}'



# Improvements

I expect to improve 3 different areas for this feature.

1) Since it's based on the weekly transaction, I would suggest using the Spring Batch capability to run as a weekly job by the scheduler. 
   In that way, we can avoid the manual triggering of API. It will be automated completely.
   
2) common idea to calculate the round-up for different currencies. I did the calculation based on the pence. I did not implement this since it would have taken a significant amount of time and would have been primarily similar to the one now.

3) Currency exchange need to be considered in the account. For example. Im planning to travel to Paris and decide to save money in EUR based on the transaction in the pound. Then that scenario might require a good currency conversion mechanism in place. - Just a thought



