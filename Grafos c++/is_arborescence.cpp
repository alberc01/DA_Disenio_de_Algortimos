//GRAFO DIRIGIDO

//Ejercicio: 11 arborescencia. 

#include <iostream>
#include <boost/graph/adjacency_list.hpp>
#include <boost/graph/bipartite.hpp>
#include <string>
#include <boost/graph/adjacency_list.hpp>
#include <boost/graph/depth_first_search.hpp>
#include <boost/cstdlib.hpp>

using namespace boost;
using namespace std;
class dfs_time_visitor :public default_dfs_visitor {

public:
	dfs_time_visitor(size_t & t, size_t & ward, bool &ok) :counter(t), ok(ok), ward(ward) { }
	template < typename Vertex, typename Graph >
	void discover_vertex(Vertex u, const Graph & g) {
		counter++;
		ward++;
	}
	template <class Edge, class Graph>
	void back_edge(Edge e, const Graph & g) {
		ok = false;
	}

private:
	size_t & counter;
	size_t & ward;
	bool & ok;
};

void allWhite(vector<default_color_type> &vertex_color) {
	int i = 0;
	while (i < vertex_color.size()) {
		if (vertex_color.at(i) == black_color) {
			vertex_color.at(i) = white_color;
		}
		i++;
	}

}

typedef adjacency_list <vecS, vecS, bidirectionalS> Graph;
template <typename Graph>
bool is_arborescence(Graph& g, int & vertex) {
	size_t counter = 1;
	size_t ward = 0;
	bool aciclic = true;
	dfs_time_visitor  vis(counter, ward, aciclic);

	std::vector<default_color_type> vertex_color(num_vertices(g));
	std::map<Graph::edge_descriptor, default_color_type> edge_color;

	auto idmap = get(vertex_index, g);
	auto vcmap = make_iterator_property_map(vertex_color.begin(), idmap);
	auto ecmap = make_assoc_property_map(edge_color);
	int max = 0;
	int cont = 0;
	bool conexed = true;
	int i = 0;
	if (num_vertices(g)-1 == num_edges(g)) {
		while (i < num_vertices(g) && aciclic && conexed && (max != num_vertices(g))) {
			typename graph_traits<Graph>::vertex_descriptor start = i;

			if (out_degree(start, g) != 0 || in_degree(start, g) != 0) {
				depth_first_visit(g, start, vis, vcmap);// coste O(V) siendo v el numero de vertices alcanzables deste el vertice start
				if (max < ward) {
					max = ward;
				}
				ward = 0;
				allWhite(vertex_color);// coste O(V) se ponen todos los vertices a blanco
			}
			else {
				conexed = false;
			}

			i++;
		}
		vertex = i - 1;
		return conexed && aciclic && (max == num_vertices(g));
	}
	else {
		return false;
	}

}

void readGraph(Graph &gr, int aristas) {

	int v1, v2;
	for (size_t i = 0; i < aristas; i++) {
		cin >> v1;
		cin >> v2;
		add_edge(v1, v2, gr);
	}
}
int main()
{
	typedef std::pair <int, int> E;
	int tam = 0;
	int i = 0;

	while (cin) {
		int aristas;
		int vertices;
		cin >> vertices;
		cin >> aristas;
		Graph gr(vertices);
		readGraph(gr, aristas);
		int vertex;
		if (is_arborescence(gr, vertex)) {
			cout << "SI " << vertex << endl;
		}
		else {
			cout << "NO" << endl;
		}
		i++;
	}
	return 0;
}
