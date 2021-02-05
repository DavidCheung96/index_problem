This was made for a programming competition. See below for the explanation of this question. 
My algorithm would take the first stock and make it the whole index. Afterwards, it will look at the the current index name and see if the end or start would respectively start or end with the same letters. If so, then it could combine it without writing the whole new stock name. 

Problem Statement
There are many different stocks in the world: AAPL, GOOG, TSLA. Stocks are tracked by various indices: DAX, ES, FTSE.

We've decided to create an ultimate World Index, that would cover all the existing stocks and indices.

How could we name it? We have an idea: the World Index name should include all the existing names! Of course, we want the name to be as short as possible.

Given a list of names, create a new name that will contain all the existing names as contiguous substrings.

Your task is to implement method

String makeName(List<String> names)
Limitations
There are up to 500 names.

Each name is an upper case string containing from 2 to 5 Latin characters.

Scoring
The resulting string must contain all the original names as contiguous substrings, otherwise the score is 0.

Try to make the answer as short as possible. The score is calculated as follows:

Let S be the total length of the original names, L is the length of your answer. Then the score is Max(0, (S-L)/S )

Test structure and time limits
There are 10 tests. The final score is an average between these 10 tests.

Time limit is 5 seconds per test.

Each test contains exactly 500 names.

Each name contains from 2 to 5 characters.

The alphabet size is limited to 5, so there are only 5 different characters in each test.

All the names are generated randomly: they have random (uniform) length and contain random characters.

Examples
Example 1
names = ["NVDA", "DAX", "XNV"]
worldIndexName = "NVDADAXXNV"
The answer is pretty long, but it's valid.

Example 2
names = ["NVDA", "DAX", "XNV"]
worldIndexName = "XNVDAX"
This is the shortest possible answer.

Example 3
names = ["FTSE", "FTS", "TSE", "FT", "TS", "SE", "FTSE"]
worldIndexName = "FTSE"
