class Prank:

	def realWeight(self, apparentGain):
		weights = []
		for i in xrange(100001):
			x = ((i+1)**2) + apparentGain
			y = x**0.5
			z = int(y)**2
			if x == z:
				weights.append(int(y))
		return (x for x in weights)
