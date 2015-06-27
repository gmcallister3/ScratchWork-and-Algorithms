
def isVowel( char ):
	char = char.lower()
	vowels = ("a", "e", "i", "o", "u", "y");
	if char in vowels:
		return True;
	else:
		return False;


print isVowel("a");
print isVowel("l");
print isVowel("O");