# roundUp
a “round-up” feature for Starling customers using our public
developer API that is available to all customers and partners.
For a customer, take all the transactions in a given week and round them up to the nearest
pound. For example with spending of £4.35, £5.20 and £0.87, the round-up would be £1.58.
This amount should then be transferred into a savings goal, helping the customer save for
future adventures.

# To Build & Run
mvn clean build will run all generate an executable JAR. Before that you need to set up the application.property with appropriate Bearer token.

# Development
I attempted to construct the resource in accordance with the current Starling API standards, which I discovered in your Swagger documentation at Starling API Docs. The round up function will invoke by calling the a rest api.

Example : 

curl --location --request PUT 'localhost:8080/api/v2/account/roundUp' \
--header 'Content-Type: application/json' \
--data-raw '{
    "accountUID": "a970f26c-c8f1-4a3b-90ef-4e26018eef3e",
    "savingGoal": "3a9d12d8-9af6-4997-bc9a-8b7261a6aef7",
    "minTimestamp": "2022-03-11T04:21:33.575Z",
    "maxTimestamp": "2022-04-11T04:21:33.575Z"
}'



# Improvements

I expect to improve 3 different area for this feature.

1) Since its based on weekly transaction, I would suggest to use the Spring Batch capability to run as weekly job by the sheduler. 
   In that way we can avoivd the manual trigger of api. It will automated completely.
   
2) common idea to calucalet the round up for different currency. I did the calcalution based on the pence. I did not implement this since it would have taken a significant amount of time and would have primarily similar to the one now.

3) Currency excahnge need to be consider in to the account. For example. Im planning to travel to Paris and decide to save money in EUR based on the transaction in 
   pound. Then that senario might required good curreny conversion mechanisam in place. - Just a thought



