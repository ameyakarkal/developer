Chess board:
- Board
This would be a list of square. where square
Initialize()
would create squares and set up pieces on the squares
- Square
  - Color (enum White, Black)
  - Alphabet (enum A - H)
  - Number (enum One - Eight)

#### daily stock price feed. 
>If you were integrating a feed of end of day stock price information (open, high, low, and closing price) for 5,000 companies, how would you do it? You are responsible for the development, rollout and ongoing monitoring and maintenance of the feed. Describe the different methods you considered and why you would recommend your approach. The feed is delivered once per trading day in a comma-separated format via an FTP site. The feed will be used by 1000 daily users in a web application.

Analysis
build a list of acceptance criteria, focus on the client.
- security
	behind authentication
- delivery / deliverables
	as a feed
	as a ftp data file
- performance
- performance monitoring
 - through put
 - connections to db
 - error logging and alerts
- optimization
	- caching
	- cdn

#### social media network

>How would you design the data structures for a very large social network (Facebook, LinkedIn, etc)? Describe how you would design an algorithm to show the connec- tion, or path, between two people (e.g., Me -> Bob -> Susan -> Jason -> You).

analysis
	- how data is used.
	- how to group the data

#### web crawler

>If you were designing a web crawler, how would you avoid getting into infinite loops?

