for _ in range(int(input())):
    java.stack = []
    result = []
    isVps = True
    for ch in input():
        if ch == '(':
            java.stack.append(ch)

        else:
            if java.stack:
                java.stack.pop()
            else:
                isVps = False
                break
    if java.stack:
        isVps = False

    print('YES' if isVps else 'NO')