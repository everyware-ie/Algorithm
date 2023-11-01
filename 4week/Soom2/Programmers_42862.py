def solution(n, lost, reserve):
    lost.sort()
    reserve.sort()

    C = set(lost) & set(reserve)
    for i in C:
        lost.remove(i)
        reserve.remove(i)

    for i in lost:
        if reserve.__contains__(i - 1):
            reserve.remove(i - 1)
        elif reserve.__contains__(i + 1):
            reserve.remove(i + 1)
        else:
            n -= 1
    return n
