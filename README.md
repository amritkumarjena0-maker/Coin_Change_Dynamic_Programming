# Coin Change Using Dynamic Programming

## Description
A Java implementation of the Coin Change problem using the Dynamic Programming approach to find the minimum number of coins required to make a given target amount.

## Features
- Dynamic Programming optimization
- Minimum coin calculation
- Actual selected coin reconstruction
- DP table display
- Input validation
- Performance measurement
- Impossible change detection

## Technologies
- Java
- Dynamic Programming
- Arrays
- Scanner
- System.nanoTime()

## Requirements
- Java JDK

## Suggested Project Folder Structure

```text
Coin_Change_Dynamic_Programming/
│
├── src/
│   └── CoinChange.java
│
├── output/
│   └── sample_output.txt
│
├── README.md
│
└── .gitignore
```

## Algorithm
1. Read coin denominations and target amount.
2. Initialize the DP array.
3. Set dp[0] = 0.
4. Calculate the minimum coins for each amount.
5. Update the DP array using previously calculated results.
6. Reconstruct the selected coins.
7. Display the minimum coin count and result.

## Complexity Analysis

- **Time Complexity:** O(n × Amount)
- **Space Complexity:** O(Amount)

## Sample Input

```text
Enter number of coins: 3
Enter coin denominations:
1 2 5
Enter target amount: 11
```

## Sample Output

```text
Minimum coins required: 3
Selected coins: 1 5 5
```

## Note
This project uses the Unbounded Coin Change approach, where each coin denomination can be used unlimited times.