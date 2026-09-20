import PageHeading from "./PageHeading";
import ProductListings from "./ProductListings";
import apiClient from "../api/apiClient";
import { useState, useEffect } from "react";

export default function Home() {
  const [products, setProducts] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  //Run once when the component mounts

  useEffect(() => {
    fetchProducts();
  }, []);

  const fetchProducts = async () => {
    try {
      setLoading(true);
      const response = await apiClient.get("/products");
      setProducts(response.data);
    } catch (error) {
      setError(error.response?.data?.message || "Failed to fetch products, Please try again.");
    } finally {
      setLoading(false);
    }
  };
    if(loading) {
      return (
        <div className="flex items-center justify-center min-h-screen">
          <span className="text-xl font-semibold">Loading Products...</span>
        </div>
      )

    }

    if(error){
      return (
        <div className="flex items-center justify-center min-h-screen">
          <span className="text-xl font-semibold text-red-500">Error: {error}</span>
        </div>
      );
    }
  
  return (
    <div className="max-w-[1152px] mx-auto px-6 py-8">
      <PageHeading title="Explore Eazy Stickers!">
        Add a touch of creativity to your space with our wide range of fun and
        unique stickers. Perfect for any ocassion!
      </PageHeading>
      <ProductListings products={products} />
    </div>
  );
}
