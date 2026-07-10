package property_inclusion_test

import (
	"testing"

	"github.com/Southclaws/schemancer/schemancer"
	"github.com/Southclaws/schemancer/schemancer/generators"
	"github.com/Southclaws/schemancer/schemancer/generators/java"
	"github.com/Southclaws/schemancer/schemancer/loader"
	"github.com/Southclaws/schemancer/tests/testutil"

	"github.com/stretchr/testify/require"
)

func TestPropertyInclusionDefault(t *testing.T) {
	schema, err := loader.FromFile("schema.yaml")
	require.NoError(t, err, "failed to load schema")

	files, err := schemancer.Generate(schema, generators.GlobalOptions{
		Language: generators.LanguageJava,
	}, java.WithPackageName("com.example.generated"))
	require.NoError(t, err, "failed to generate")

	testutil.WriteAndCompareMultipleFiles(t, files, "output", "expected")
}

func TestPropertyInclusionAlways(t *testing.T) {
	schema, err := loader.FromFile("schema.yaml")
	require.NoError(t, err, "failed to load schema")

	files, err := schemancer.Generate(schema, generators.GlobalOptions{
		Language: generators.LanguageJava,
	}, java.WithPackageName("com.example.generated"), java.WithPropertyInclusion(java.PropertyInclusionAlways))
	require.NoError(t, err, "failed to generate")

	testutil.WriteAndCompareMultipleFiles(t, files, "expected_always", "expected_always")
}
