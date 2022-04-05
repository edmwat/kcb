# kcb technical assessment
## Libraries used 
- java-jwt
-Used to generate tokens for secure access of endpoints.

# DUMMY DATA USED
## Data for authentication
- Created two users
-username: "kcb1@gmail.com" with password: "kcb1"
-username: "kcb2@gmail.com" with password: "kcb2"
- use the endpoint "localhost:8080/authenticate" with a json body containing username and password above to get access token.

## Accounts Data
- Created 2 accounts
-Account(1l,1234L,"KIMEQTY","kcb1@gmail.com")
-Account(2l,4321L,"KIMKCB","kcb2@gmail.com")

- and Two cards
-Card(1l,"credit card",1l,"Virtual")
-Card(2l,"Debit card",2l,"physical")

## API Endpoints
- http://localhost:8080/accounts/all to access accounts for the loggedin customer.
- http://localhost:8080/cards/{accountId} to access cards for an account


