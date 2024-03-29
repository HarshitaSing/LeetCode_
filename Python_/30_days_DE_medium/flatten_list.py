# Write a function to flatten a nested list using recursion in Python (medium)

def flatten(L):
    if len(L)==1:
        if type(L[0]) == list:
            result = flatten(L[0])
        else:
            result = L
    elif type(L[0]) == list:
        result = flatten(L[0]) + flatten(L[1:])
    else:
        result = [L[0]] + flatten(L[1:])
    return result

def main():
    print("inside main")
    print(flatten([[1],[1,2],[1,2,3]]))
  
if __name__=="__main__":
    main()
