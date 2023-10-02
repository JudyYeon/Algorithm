for _ in range(int(input())):
    stack = []
    result = []
    isVps = True
    for ch in input():
        if ch == '(':
            stack.append(ch)

        else:
            if stack:
                stack.pop()
            else:
                isVps = False
                break
    if stack:
        isVps = False

    print('YES' if isVps else 'NO')