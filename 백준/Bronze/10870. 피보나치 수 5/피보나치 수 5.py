def Fibonacci(n):
    if n < 2:
        return n
    return Fibonacci(n-2) + Fibonacci(n-1)
    
n = int(input())
print(Fibonacci(n))