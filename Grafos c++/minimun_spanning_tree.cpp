////GRAFO NO DIRIGIDO
////Ejercicio 15:Pavimentar Barro City
//#include <iostream>
//#include <boost/graph/adjacency_list.hpp>
//#include <string>
//#include <boost/graph/adjacency_list.hpp>
//#include <boost/graph/depth_first_search.hpp>
//#include <boost/cstdlib.hpp>
//#include <boost/graph/prim_minimum_spanning_tree.hpp>
//#include <boost/property_map/property_map.hpp>
//
//using namespace boost;
//using namespace std;
//
//typedef boost::property<boost::edge_weight_t, int> EdgeWeightProperty;
//typedef adjacency_list < vecS, vecS, undirectedS,
//	property<vertex_distance_t, int>,
//	EdgeWeightProperty> Graph;
//
//template <typename Graph>
//int best_tree(Graph& g) {
//	std::vector < graph_traits < Graph >::vertex_descriptor>p(num_vertices(g));
//	prim_minimum_spanning_tree(g, &p[0]);
//	int aux = 0;
//	int i = 0;
//	int conexedcomps = 0;
//	while (i != p.size() && conexedcomps < 2) {
//		if (p[i] != i) {
//			typedef Graph::edge_descriptor Edge;
//			std::pair<Edge, bool> ed = boost::edge(i, p[i], g);
//			aux += get(edge_weight_t(), g, ed.first);
//		}
//		else {
//			conexedcomps++;
//			aux = 0;
//		}
//		++i;
//	}
//
//	return aux;
//}
//
//void readGraph(Graph &gr, int aristas) {
//	typedef std::pair < int, int >E;
//	const int num_nodes = 5;
//	int v1, v2;
//	int peso;
//	for (int i = 0; i < aristas; i++) {
//		cin >> v1;
//		cin >> v2;
//		cin >> peso;
//		add_edge(v1 - 1, v2 - 1, EdgeWeightProperty(peso), gr);
//	}
//
//}
//int main()
//{
//	int tam = 0;
//	int i = 0;
//	int aristas;
//	int vertices;
//	while (cin) {
//
//		cin >> vertices;
//		cin >> aristas;
//		Graph gr(vertices);
//		readGraph(gr, aristas);
//		int sol = best_tree(gr);
//		if (sol > 0) cout << sol << endl;
//		else cout << "Imposible\n";
//	}
//	return 0;
//}
//// La complejidad del tiempo del algoritmo prim_minimum_spanning_tree();, es O (E log V) para rellenar el vector p que es un propertymap, y luego hay que recorrer ese propertymap que tiene longuitos n siendo el numero de vertices, el coste total en ejecucion por tanto seria, O ((E log V) + V).
